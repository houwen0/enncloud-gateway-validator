/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.encloud.framework.validator.support;


import java.util.*;


public interface ShortcutConfigurable {

	static String normalizeKey(String key, int entryIdx, ShortcutConfigurable argHints,
                               Map<String, String> args) {
		// RoutePredicateFactory has name hints and this has a fake key name
		// replace with the matching key hint
		if (!argHints.shortcutFieldOrder().isEmpty() && entryIdx < args.size()
				&& entryIdx < argHints.shortcutFieldOrder().size()) {
			key = argHints.shortcutFieldOrder().get(entryIdx);
		}
		return key;
	}

	static Object getValue(String entryValue) {
		Object value;
		String rawValue = entryValue;
		if (rawValue != null) {
			rawValue = rawValue.trim();
		}
		if (rawValue != null && rawValue.startsWith("#{") && entryValue.endsWith("}")) {
			// assume it's spel
			value = "###";
		}
		else {
			value = entryValue;
		}
		return value;
	}

	default ShortcutType shortcutType() {
		return ShortcutType.DEFAULT;
	}

	/**
	 * Returns hints about the number of args and the order for shortcut parsing.
	 * @return the list of hints
	 */
	default List<String> shortcutFieldOrder() {
		return Collections.emptyList();
	}

	default String shortcutFieldPrefix() {
		return "";
	}

	enum ShortcutType {

		DEFAULT {
			@Override
			public Map<String,Object> normalize(String args,
					ShortcutConfigurable shortcutConf) {
				Map<String,Object> map = new HashMap<>();
				if(args!=null){
					String[] argsArr=args.split(",");

					for(int i=0;i<argsArr.length;i++){
						map.put(shortcutConf.shortcutFieldOrder().get(i),argsArr[i]);
					}
				}
				return map;
			}
		},

		GATHER_LIST {
			@Override
			public Map<String, Object> normalize(String args,
					ShortcutConfigurable shortcutConf) {
				Map<String, Object> map = new HashMap<>();
				// field order should be of size 1
				List<String> fieldOrder = shortcutConf.shortcutFieldOrder();
//				Assert.isTrue(fieldOrder != null && fieldOrder.size() == 1,
//						"Shortcut Configuration Type GATHER_LIST must have shortcutFieldOrder of size 1");
				String fieldName = fieldOrder.get(0);
//				map.put(fieldName,
//						args.values().stream()
//								.map(value -> getValue( value))
//								.collect(Collectors.toList()));
				return map;
			}
		},

		// list is all elements except last which is a boolean flag
		GATHER_LIST_TAIL_FLAG {
			@Override
			public Map<String, Object> normalize(String args,
					ShortcutConfigurable shortcutConf) {
				Map<String, Object> map = new HashMap<>();
//				// field order should be of size 1
//				List<String> fieldOrder = shortcutConf.shortcutFieldOrder();
////				Assert.isTrue(fieldOrder != null && fieldOrder.size() == 2,
////						"Shortcut Configuration Type GATHER_LIST_HEAD must have shortcutFieldOrder of size 2");
//				List<String> values = new ArrayList<>(args.values());
//				if (!values.isEmpty()) {
//					// strip boolean flag if last entry is true or false
//					int lastIdx = values.size() - 1;
//					String lastValue = values.get(lastIdx);
//					if (lastValue.equalsIgnoreCase("true")
//							|| lastValue.equalsIgnoreCase("false")) {
//						values = values.subList(0, lastIdx);
//						map.put(fieldOrder.get(1),
//								getValue(lastValue));
//					}
//				}
//				String fieldName = fieldOrder.get(0);
//				map.put(fieldName,
//						values.stream().map(value -> getValue(value))
//								.collect(Collectors.toList()));
				return map;
			}
		};

		public abstract Map<String,Object> normalize(String args,
				ShortcutConfigurable shortcutConf);

	}

}

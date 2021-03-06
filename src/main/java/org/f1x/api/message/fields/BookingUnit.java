/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum BookingUnit implements org.f1x.api.message.types.ByteEnum {
	EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT((byte)'0'),
	AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER((byte)'1'),
	AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE((byte)'2');

	private final byte code;

	BookingUnit (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static BookingUnit parse(String s) {
		switch(s) {
			case "0" : return EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT;
			case "1" : return AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER;
			case "2" : return AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE;
		}
		return null;
	}

}
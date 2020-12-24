/*
 * Copyright 2020 Google LLC, MobilityData IO
 *
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

package org.mobilitydata.gtfsvalidator.table;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class GtfsFareAttributePaymentMethodTest {
    @Test
    public void shouldReturnEnumValue() {
        assertThat(GtfsFareAttributePaymentMethod.forNumber(0)).isEqualTo(GtfsFareAttributePaymentMethod.ON_BOARD);
        assertThat(GtfsFareAttributePaymentMethod.forNumber(1)).isEqualTo(GtfsFareAttributePaymentMethod.BEFORE_BOARDING);
    }

    @Test
    public void shouldReturnNull() {
        assertThat(GtfsFareAttributePaymentMethod.forNumber(-1)).isNull();
        assertThat(GtfsFareAttributePaymentMethod.forNumber(4)).isNull();
    }
}

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Eric Kubenka
 */

package eu.tsystems.mms.testerra.demo.localization;

import eu.tsystems.mms.tic.testframework.l10n.SimpleLocalization;

/**
 * Locals Enum
 * https://tapas-docs.s3.eu-central-1.amazonaws.com/testerra/latest/index.html#_localization
 * <p>
 * Date: 14.05.2020
 * Time: 15:27
 *
 * @author Eric Kubenka
 */
public enum Localization {

    BUTTON_ADD_ELEMENT,
    BUTTON_DELETE;

    public String toString() {
        return SimpleLocalization.getText(this.name());
    }
}

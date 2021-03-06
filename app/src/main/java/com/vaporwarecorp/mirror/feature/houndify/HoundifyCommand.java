/*
 * Copyright 2016 Johann Reyes
 *
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
 */
package com.vaporwarecorp.mirror.feature.houndify;

import com.hound.core.model.sdk.ClientMatch;
import com.hound.core.model.sdk.CommandResult;
import com.vaporwarecorp.mirror.feature.Command;

public interface HoundifyCommand extends Command {
// -------------------------- OTHER METHODS --------------------------

    void executeCommand(CommandResult result);

    ClientMatch getClientMatch();

    String getCommandKind();

    String getCommandTypeKey();

    String getCommandTypeValue();

    boolean matches(CommandResult commandResult);
}

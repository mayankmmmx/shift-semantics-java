/*
 * Copyright 2016 Shape Security, Inc.
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
package com.shapesecurity.shift.semantics.asg;

import com.shapesecurity.functional.Pair;
import com.shapesecurity.functional.data.Maybe;
import com.shapesecurity.shift.scope.Variable;
import org.jetbrains.annotations.NotNull;

public class TryCatchFinally implements Node {
	@NotNull
	public final Block tryBody;
	@NotNull
	public final Maybe<Pair<Variable, Block>> catchBody;
	@NotNull
	public final Block finallyBody;

	public TryCatchFinally(@NotNull Block tryBody, @NotNull Maybe<Pair<Variable, Block>> catchBody, @NotNull Block finallyBody) {
		this.tryBody = tryBody;
		this.catchBody = catchBody;
		this.finallyBody = finallyBody;
	}
}
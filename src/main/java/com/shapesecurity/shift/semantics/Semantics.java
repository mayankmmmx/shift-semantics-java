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
package com.shapesecurity.shift.semantics;

import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.shift.scope.Variable;
import com.shapesecurity.shift.semantics.asg.Node;
import org.jetbrains.annotations.NotNull;

public class Semantics {
	@NotNull
	public final Node node;
	@NotNull
	public final ImmutableList<Variable> locals;
	@NotNull
	public final ImmutableList<String> scriptVarDecls;

	Semantics(@NotNull Node node, @NotNull ImmutableList<Variable> locals, @NotNull ImmutableList<String> scriptVarDecls) {
		this.node = node;
		this.locals = locals;
		this.scriptVarDecls = scriptVarDecls;
	}
}
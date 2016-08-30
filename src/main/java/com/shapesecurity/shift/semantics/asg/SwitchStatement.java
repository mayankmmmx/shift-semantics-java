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
import com.shapesecurity.functional.data.ImmutableList;
import org.jetbrains.annotations.NotNull;

public class SwitchStatement implements Node {
	@NotNull
	public final LocalReference discriminant;
	@NotNull
	public final ImmutableList<Pair<NodeWithValue, Block>> preDefaultCases;
	@NotNull
	public final Block defaultCase;
	@NotNull
	public final ImmutableList<Pair<NodeWithValue, Block>> postDefaultCases;

	public SwitchStatement(
		@NotNull LocalReference discriminant, @NotNull ImmutableList<Pair<NodeWithValue, Block>> preDefaultCases,
		@NotNull Block defaultCase, @NotNull ImmutableList<Pair<NodeWithValue, Block>> postDefaultCases
	) {
		this.discriminant = discriminant;
		this.preDefaultCases = preDefaultCases;
		this.defaultCase = defaultCase;
		this.postDefaultCases = postDefaultCases;
	}
}

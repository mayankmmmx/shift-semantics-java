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

import com.shapesecurity.functional.data.Either;
import org.jetbrains.annotations.NotNull;

public class VariableAssignment implements NodeWithValue {
	@NotNull
	public final Either<GlobalReference, LocalReference> ref;
	@NotNull
	public final NodeWithValue value;
	public final boolean strict;

	public VariableAssignment(
		@NotNull Either<GlobalReference, LocalReference> ref, @NotNull NodeWithValue value, boolean strict
	) {
		this.ref = ref;
		this.value = value;
		this.strict = strict;
	}

	public VariableAssignment(@NotNull GlobalReference ref, @NotNull NodeWithValue value, boolean strict) {
		this.ref = Either.left(ref);
		this.value = value;
		this.strict = strict;
	}

	public VariableAssignment(@NotNull LocalReference ref, @NotNull NodeWithValue value, boolean strict) {
		this.ref = Either.right(ref);
		this.value = value;
		this.strict = strict;
	}
}

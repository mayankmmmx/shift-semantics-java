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

package com.shapesecurity.shift.es2016.semantics.asg.BinaryOperation;

import com.shapesecurity.shift.es2016.semantics.asg.NodeWithValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import java.util.Objects;

public class InstanceOf extends BinaryOperation {
	@Nonnull
	public final NodeWithValue left;

	@Override
	public boolean equals(@Nullable Object o) {
		if (this == o) return true;
		if (!(o instanceof InstanceOf)) return false;
		InstanceOf that = (InstanceOf) o;
		return Objects.equals(left, that.left) &&
				Objects.equals(right, that.right);
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}

	@Nonnull
	public final NodeWithValue right;

	@Override
	@Nonnull
	public NodeWithValue left() {
		return this.left;
	}

	@Override
	@Nonnull
	public NodeWithValue right() {
		return this.right;
	}

	public InstanceOf(@Nonnull NodeWithValue left, @Nonnull NodeWithValue right) {
		this.left = left;
		this.right = right;
	}
}

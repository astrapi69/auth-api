/**
 * The MIT License
 *
 * Copyright (C) 2021 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.auth.sign.up;

import io.github.astrapi69.auth.sign.in.SignInModel;

/**
 * The interface {@link SimpleSignUpModel} extends the {@link SignInModel} and adds the repeat
 * password of the member and the term of use flag.
 */
public interface SimpleSignUpModel extends SignInModel
{

	/**
	 * Gets the repeat password.
	 *
	 * @return the repeat password
	 */
	String getRepeatPassword();

	/**
	 * Sets the repeat password.
	 *
	 * @param repeatPassword
	 *            the new repeat password
	 */
	void setRepeatPassword(final String repeatPassword);

	/**
	 * Checks if the term of use is accepted
	 *
	 * @return true if the term of use is accepted otherwise false
	 */
	boolean isTermOfUseAccepted();

	/**
	 * Sets the term of use accepted.
	 *
	 * @param termOfUseAccepted
	 *            the new term of use accepted
	 */
	void setTermOfUseAccepted(final boolean termOfUseAccepted);

}

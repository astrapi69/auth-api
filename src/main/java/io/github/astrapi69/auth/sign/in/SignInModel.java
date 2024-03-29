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
package io.github.astrapi69.auth.sign.in;

import java.io.Serializable;

/**
 * The interface {@link SignInModel} for sign in.
 */
public interface SignInModel extends Serializable
{

	/** The Constant EMAIL. */
	static final String EMAIL = "email";

	/** The Constant PASSWORD. */
	static final String PASSWORD = "password";

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	String getEmail();

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	void setEmail(final String email);

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	String getPassword();

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	void setPassword(final String password);

}

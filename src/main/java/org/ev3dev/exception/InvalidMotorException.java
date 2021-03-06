/*******************************************************************************
 * Any modification, copies of sections of this file must be attached with this
 * license and shown clearly in the developer's project. The code can be used
 * as long as you state clearly you do not own it. Any violation might result in
 *  a take-down.
 *
 * MIT License
 *
 * Copyright (c) 2016, 2017 Anthony Law
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/
package org.ev3dev.exception;

/***
 * This exception is thrown if:<br>
 * <b>LargeMotor</b> selected port's driver isn't LargeMotor's driver.<br>
 * <b>MediumMotor</b> selected port's driver isn't MediumMotor's driver.
 * @author Anthony
 *
 */
public class InvalidMotorException extends EV3LibraryException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMotorException(){
		super();
	}
	
	public InvalidMotorException(String message){
		super(message);
	}
	
	public InvalidMotorException(String message, Throwable cause){
		super(message, cause);
	}
	
	public InvalidMotorException(Throwable cause){
		super(cause);
	}
}

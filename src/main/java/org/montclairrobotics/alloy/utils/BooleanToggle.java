/*
MIT License

Copyright (c) 2018 Garrett Burroughs

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package org.montclairrobotics.alloy.utils;

/**
 * An input that can be toggled between true and false
 *
 * @author Garrett Burroughs
 * @version 0.1
 * @since 0.1
 */
public class BooleanToggle extends Toggleable implements Input<Boolean> {

    @Override
    public Boolean get() {
        return status.isEnabled();
    }

    @Override
    /** Method to be called when the toggleable is enabled */
    public void enableAction() {
        // Do nothing because all the action it taken care of by toggle()
    }

    @Override
    /** Method to be called when the toggleable is disabled */
    public void disableAction() {
        // Do nothing because all the action it taken care of by toggle()
    }
}

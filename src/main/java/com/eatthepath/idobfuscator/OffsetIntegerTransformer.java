package com.eatthepath.idobfuscator;

/**
 * Transforms integers by adding a given offset, and reverses transformations by subtracting that offset.
 *
 * @author <a href="https://github.com/jchambers">Jon Chambers</a>
 */
public class OffsetIntegerTransformer implements IntegerTransformer {

    private final int offset;

    /**
     * Constructs a new offset transformer with the given offset. Offsets should be non-zero (otherwise the
     * transformation would be a no-op), but zero offsets are technically allowed.
     *
     * @param offset the offset to apply when transforming numbers
     */
    public OffsetIntegerTransformer(final int offset) {
        this.offset = offset;
    }

    /**
     * Transforms the given integer by adding this transformer's offset to that integer.
     *
     * @param i the integer to offset
     *
     * @return the transformed integer
     */
    @Override
    public int transformInteger(final int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Reverses an offset transformation by subtracting this transformer's offset from the given integer.
     *
     * @param i the integer for which to reverse an offset transformation
     *
     * @return the original integer
     */
    @Override
    public int reverseTransformInteger(final int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

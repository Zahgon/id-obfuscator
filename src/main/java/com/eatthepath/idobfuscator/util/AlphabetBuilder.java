package com.eatthepath.idobfuscator.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Constructs alphabets for use with a {@link com.eatthepath.idobfuscator.AlphabetCodec}. Alphabet builders are not
 * thread-safe, and should generally be considered "single-shot" tools for constructing
 * {@link com.eatthepath.idobfuscator.AlphabetCodec} instances.
 *
 * @author <a href="https://github.com/jchambers">Jon Chambers</a>
 */
public class AlphabetBuilder {

    private static final List<Character> DIGITS = getCharacterListFromString("0123456789");

    private static final List<Character> UPPERCASE_LATIN_LETTERS = getCharacterListFromString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    private static final List<Character> LOWERCASE_LATIN_LETTERS = getCharacterListFromString("abcdefghijklmnopqrstuvwxyz");

    private static final List<Character> URL_SAFE_PUNCTUATION = getCharacterListFromString("$-_.!*'(),");

    private static final List<Character> VOWELS = getCharacterListFromString("AEIOUaeiou");

    private static final List<Character> VISUALLY_SIMILAR_CHARACTERS = getCharacterListFromString("0Oo1Il5S6G");

    private boolean includeUppercaseLatinLetters;

    private boolean includeLowercaseLatinLetters;

    private boolean includeDigits;

    private boolean includeUrlSafePunctuation;

    private boolean excludeVowels;

    private boolean excludeVisuallySimilarCharacters;

    private List<Character> additionalIncludedCharacters = new ArrayList<>();

    private List<Character> additionalExcludedCharacters = new ArrayList<>();

    private Long shuffleSeed;

    /**
     * Includes decimal digits (0-9) in the alphabet under construction.
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder includeDigits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Includes uppercase Latin letters (A-Z) in the alphabet under construction.
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder includeUppercaseLatinLetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Includes lowercase Latin letters (A-Z) in the alphabet under construction.
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder includeLowercaseLatinLetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Includes URL-safe punctuation characters ({@code $-_.!*'(),}) in the alphabet under construction.
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder includeUrlSafePunctuation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Excludes uppercase and lowercase vowels (a, e, i, o, and u) from the the alphabet under construction. This can
     * be helpful for preventing dictionary words (and especially profanity) from appearing in obfuscated identifiers.
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder excludeVowels() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Excludes characters that are visually similar to other Latin letters or decimal digits (for example, O and 0 or
     * l, I and 1) from the alphabet under construction. This can be especially helpful in circumstances when obfuscated
     * identifiers may be transcribed by hand or communicated verbally.
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder excludeVisuallySimilarCharacters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Includes the given collection of additional characters in the alphabet under construction. Care should be taken
     * not to include characters that may have already been added by other means (e.g. uppercase Latin letters).
     *
     * @param additionalCharacters a collection of characters to include in the alphabet under construction
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder includeAdditionalCharacters(final Collection<Character> additionalCharacters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Includes the given additional characters in the alphabet under construction. Care should be taken not to include
     * characters that may have already been added by other means (e.g. uppercase Latin letters).
     *
     * @param additionalCharacters the characters to include in the alphabet under construction
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder includeAdditionalCharacters(final char... additionalCharacters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Excludes the given collection of characters from the alphabet under construction.
     *
     * @param additionalCharacters a collection of characters to exclude from the alphabet under construction
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder excludeAdditionalCharacters(final Collection<Character> additionalCharacters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Excludes the given characters from the alphabet under construction.
     *
     * @param additionalCharacters a collection of characters to exclude from the alphabet under construction
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder excludeAdditionalCharacters(final char... additionalCharacters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the random seed that will be used to randomize the order of characters in the alphabet under construction.
     * If not specified, the alphabet under construction will not be shuffled.
     *
     * @param randomSeed the random seed to use for shuffling the characters in the alphabet under construction
     *
     * @return a reference to this alphabet builder
     */
    public AlphabetBuilder shuffleWithRandomSeed(final long randomSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Constructs an alphabet with the characters that have been included, less the characters that have been excluded,
     * by this builder. If a random seed was provided, the order of the characters in the returned alphabet will be
     * randomized.
     *
     * @return an array of characters in the alphabet constructed by this builder
     */
    public char[] build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static List<Character> getCharacterListFromString(final String string) {
        final char[] characterArray = string.toCharArray();
        final List<Character> characterList = new ArrayList<>();
        for (final char c : characterArray) {
            characterList.add(c);
        }
        return characterList;
    }
}

package net.spirion.jmapperissue;

/**
 * Run the test using this class.
 */
public class TestRunner {

    /**
     * Run the test.
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        final ClassMappingDelegate classMappingDelegate = new ClassMappingDelegate();
        classMappingDelegate.runMappingTest(1);
    }

}

package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.splitstack.SplitStackInto7;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_SplitStackInto7Block extends AbstractCLIJxBlock {
   
    /**
     * Splits an input stack into #n# image stacks. 
     *  * Slices 0, n, 2*n, ... will become part of the first output stack.
     *  * Slices 1, n+1, 2*n+1, ... will become part of the second output stack.
     * Only up to 12 output stacks are supported.
     */
    public CLIJx_SplitStackInto7Block() {
        super(new SplitStackInto7());
    }

}
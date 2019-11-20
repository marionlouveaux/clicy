package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedmath.Equal;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_EqualBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines if two images A and B equal pixel wise.
     * 
     * f(a, b) = 1 if a == b; 0 otherwise. 
     */
    public CLIJx_EqualBlock() {
        super(new Equal());
    }

}

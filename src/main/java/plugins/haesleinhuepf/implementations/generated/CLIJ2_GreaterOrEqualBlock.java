package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GreaterOrEqual;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GreaterOrEqualBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines if two images A and B greater or equal pixel wise. 
     * 
     * f(a, b) = 1 if a >= b; 0 otherwise. 
     */
    public CLIJ2_GreaterOrEqualBlock() {
        super(new GreaterOrEqual());
    }

}

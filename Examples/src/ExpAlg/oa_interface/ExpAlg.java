package ExpAlg.oa_interface;

import com.zewei.annotation.processor.Algebra;

@Algebra
public interface ExpAlg<Exp> {
	Exp Var(String s);
	Exp Lit(int i);
	Exp Add(Exp e1, Exp e2);
}

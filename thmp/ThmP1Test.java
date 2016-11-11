package thmp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.wolfram.alpha.parser.preparser.TexConverter;

import thmp.ThmP1.ParsedPair;

/*
 * Test class for ThmP1
 */
public class ThmP1Test {
	
	static{
		/*Maps.buildMap();
		try {
			Maps.readLexicon();
			Maps.readFixedPhrases();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}

	//the char of F_p is p
		public static void main(String[] args) throws IOException{
			//System.out.print("Got to main!");
			//ThmP1.buildMap();
			
			//ThmP1 p1 = new ThmP1();
			//String[] strAr = p1.preprocess("a disjoint or perfect field is a field".split(" "));
			//String[] strAr = p1.preprocess("quadratic extension has degree 2".split(" "));
			//String[] strAr = p1.preprocess("finite field is field".split(" "));
			//String[] strAr = p1.preprocess("field F extend field F".split(" "));
			
			//String[] strAr = p1.preprocess("a field or ring is a ring".split(" "));
			//String[] strAr = p1.preprocess("let T be any linear transformation ".split(" "));
			//String[] strAr = "let f be a linear transformation between V and W ".split(" ");
			//String[] strAr = "a linear transformation between V and W ".split(" ");
			//String[] strAr2 = "f is an invertible matrix".split(" ");
			//String[] strAr = p1.preprocess("if a field is ring then ring is ring".split(" "));
			//String[] strAr = p1.preprocess("a basis of a vector space consists of a set of linearly independent vectors".split(" "));
			//String[] strAr = p1.preprocess("finitely many vectors are called linearly independent if their sum is zero".split(" "));
			//String[] strAr = p1.preprocess("elements in symmetric group are conjugate if they have the same cycle type".split(" "));
			String[] strAr; 
			strAr = "for all x x is a number".split(" ");
			strAr = "suppose f is measurable and finite on E, and E has finite measure".split(" ");
			strAr = "the number of conjugacy class of the symmetric group is equal to the number of partitions of n".split(" ");
			String st = "let H be a normal subgroup of the group G. G acts on H as automorphisms of H.";
			st = "conjugate elements and conjugate subgroups have the same order";
			st = "A is a group and is a subgroup";
			st = "let G be a group, conjugation by g is called a automorphism of G";
			st = "if p is an odd prime and n is an integer, then the automorphism group of the cyclic group of order p is cyclic";
			st = "let p be a prime and let V be an abelian group, with the property that b is c, then V is an n dimensional vector space over the finite field";
			st = "the automorphism group of the cyclic group of order 2 is isomorphic to Z";
			//st = "the number of conjugacy class of the symmetric group is equal to the number of partitions of n";
			//st = "let G be a group, then G is a group";
			st = "let G be a group and let p be a prime, a group of order that is a power of p is called a p group";
			st = "a group with order that is a power of p is called a p group. a subgroup of G that is a p group is called a p subgroup. p subgroup.";
			st = "a group with order that is a power of p is defined to be a p subgroup of G";
			st = "the p subgroups of G are denoted by Syl";
			st = "a subgroup of order a power of p is called a p subgroup, the number of p subgroup of G is 2"; //or "of the form p^k"
			st = "the number of p subgroup of G is 2";
			st = "subgroups of G exist";
			st = "there exists a finite semiring with order 11";
			st = "n is the index in G of the normalizer for any p subgroup";
			st = "let G be a group of order p, where p is a prime not dividing m";
			st = "Z for prime p are the only abelian simple groups";
			st = "Z/p for prime p are the only abelian simple groups";
			st = "the number of p groups of G is of the form kp";
			st = "let P be a p subgroup of G, the following are equivalent, "
					+ "P is the unique subgroup, P is normal in a group G, "
					+ "all subgroups generated by elements of p power order are p groups,"
					+ "if X is any subset of G such that x is a power of p for all x in X";
			st = "if X is any subset of G such that x is a power of p for all x in X, "
					+ "then X is a p group";
			st = "if the order of G is 60 and G has more than 1 p subgroup, then G is simple";
			st = "a nontrivial group is simple if it contains no nontrivial normal subgroups";
			//st = "";
			st = "if a group G is abelian, then it is nilpotent";
			st = "let p be a prime and let P be a group of order p, then P is nilpotent of nilpotence class at most d";
			st = "suppose that tex and tex are finite ring maps. then tex is finite";
			//String[] strAr = p1.preprocess("F is a extension over Q".split(" "));			
			st = "a  system tex of tex-modules over tex consists of a family of tex-modules tex indexed by tex and a family of tex-module maps tex such that for all tex tex";	
			st = "a field extends a field";
			//st = "given field of a field of a field";
			st = "A system tex of tex-modules over tex consists of a tex of tex-modules tex";
			st = "the colimit of the system tex is the quotient tex-module tex where tex is the tex-submodule generated by all elements tex where tex is the natural inclusion.";
			st = "a ring is field if and only if it is a field";
			//st = "A system tex of tex-modules over tex consists of a tex";
			//st = "A system tex over tex-modules";
			//st = "given a commutative diagram tex of abelian groups of family";
			//st = "given a commutative diagram of rows";
			//st = "given a commutative diagram ";
			//st = "tex is of  finite presentation if there exist integers tex and polynomials tex and an isomorphism of tex-algebras tex";
			st = "a ring is a field, if it is a field";
			st = "a system tex of tex-modules over tex consists of a family of tex-"
					+ "modules tex indexed by tex and a family of tex-"
					+ "module maps tex such that for all tex tex.";
			//st = "family of fields indexed by tex and a family of tex-module maps such that for all tex";
			st = "a  partially ordered set is a set tex together with a relation tex which is transitive  and reflexive.";
			st = "a  directed set tex is a partially ordered set tex such that tex is not empty and such that tex, there exists tex with tex";
			//st = "there exists tex with tex";
			//st = "a field that is a field extension";			
			//st = "a  partially ordered set is a set tex together with a relation tex which is transitive  and reflexive";
			//st = " a set tex together with a relation tex which is transitive  and reflexive";
			st = "Let tex be a ring. Let tex a multiplicative subset. Let tex, tex be tex-modules. Assume all the elements of tex act as automorphisms on tex. "
					+ "Then the canonical map tex induced by the localization map, is an isomorphism.";
			st = "Let tex be a ring. Let tex be a multiplicative subset. Let tex be an tex-module. Then tex where the partial ordering on tex is given by "
					+ "tex for some tex in which case the map tex is given by tex.";
			st = "let $(m_i, \\mu_{ij})$, $(n_i, \nu_{ij})$ be systems of $r$-modules over the same partially ordered set.";
			st = "systems of $f$-modules over the same partially ordered set.";
			st = "$f$-modules over set.";
			st = "for any three \\$r\\$-modules \\$m, n, p\\$, \\$\\$  \\$\\$";
			st = "let $r$ be a ring, let $m$ and $n$ be $r$-modules. ";
			st = "m is finitely presented";
			st = "an abelian group $n$ is called an  $$-bimodule} if it is both an $a$-module and a $b$-module, and the actions "
					+ "$a to end$ and $b to end$ are compatible in the sense that $b = a$ for all $a in a, bin b, xin n$. usually we denote it as $_an_b$.";
			st = "a system $$ of $r$-modules over $i$ consists of a family of $r$-modules ${m_i}_{i in i}$ indexed by $i$ and a family of $r$-module maps ${mu_{ij} : m_i to m_j}_{i leq j}$, such that for all $i leq j leq k$,";
			st = "a system $S$ of $r$-modules over $i$ consists of a family of $R$-modules ${m_i}_{i in i}$ indexed by $i$ and a family of $R$-module maps ${mu_{ij} : m_i to m_j}_{i leq j}$.";
			st = "an abelian group can be written as a direct sum of cyclic groups";
			st = "a finitely generated abelian group is isomorphic to a direct sum of cyclic groups";
			//st = "b is isomorphic to c";
			st = "functor is unique"; //try to parse "unique and field"
			st = "a ring called $ring, ,       ring$ ";
			st = "Let $j$ be a set. "; /////
			//st = "$s$ is a set"; /////
			//st = " For any $R$-multilinear mapping $f : M_1times ldots times M_r to P$ there exists a unique $R$-module homomorphism $f' : T to P$ such that $f'circ g = f$. Such a module $T$ is unique up to unique isomorphism."
			//		+ "We denote it $M_1 otimes_R ldots otimes_R M_r$ and we denote the universal multilinear map $(m_1, ldots, m_r) mapsto m_1 otimes otimes m_r$";
			//st = "field satisfying this property";
			st = "$(A, B)$-bimodule";
			st = "in the sense that F is a field";
			st = "there exists a pair consisting of $F, G$";
			st = "this function is $R$-linear";
			st = "in other words, F is field";
			st = "tensoring each term is perfect";
			st = "group is $R$-module if it is both F and B";
			st = "abelian group $N$ is called an  $(A, B)$-bimodule if it is both an $A$-module and a $B$-module";
			st = "$A, B$-module is perfect";
			st = "tensoring each term in the original right exact sequence preserves the exactness";
			st = "tensoring each term in the original right exact sequence preserves the exactness";
			st = "F and G is canonically isomorphic to H";
			st = "In other words, this is a field";
			st = "a field, a ring, and a group";
			st = "a field is said to be a ring";
			st = "for a multiplicative subset $S$ of $R$ we have a field";
			st = "for a multiplicative subset $S$ of $R$";
			st = "for subset S of R and for subset F of J";
			st = "group of F of F"; 
			st = "given a field , call it F";
			st = "Usually we call field F";
			//st = "for any $R$-linear mapping, there exists a map";
			st = "group of pure ideals";
			st = "then $R$ is a regular local ring";
			st = "if $R_1, R_3$ are rings";
			st = "this is a (perfect) field";
			//st = "this field is perfect and every field is good"; ///*****
			st = "$R$ is Noetherian and every R algebra is catenary.";
			//st = "A ring $R$ is said to be  universally catenary if $R$ is Noetherian and every $R$ algebra of finite type is catenary.";
			
			//st = "let $A : R$ be a ring";
			st = "A maximal ideal $I$ with $I$ proper";
			st = "ideal with $I$ proper";
			st = "Let $x_1, ldots, x_c in mathfrak m$ be elements";
			st = "Then $$ x_1, ldots, x_c text{ is a regular sequence }Leftrightarrow dim(R(x_1, ldots, x_c)) = dim(R) - c $$ If so $x_1, ldots, x_c$ can be extended to a regular sequence of length $dim(R)$ and each quotient $R/(x_1, ldots, x_i)$ is a Cohen-Macaulay ring of dimension $dim(R) - i$";
			//st = "Then $$ x_1, ldots, x_c text{ is a regular sequence }Leftrightarrow dim(R(x_1, ldots, x_c)) = dim(R) - c $$ If so $x_1, ldots, x_c$ can be extended to a regular sequence of length $dim(R)$";
			//st = "a field is a ring and each quotient $R/(x_1, ldots, x_i)$ is a Cohen-Macaulay ring of dimension $dim(R) - i$";
			//st = "a field is a ring and a field is a ring and a field is a ring";
			//st = "a field is a ring and a field is a ring";
			st = "this can be written as F";
			st = "this can be done";
			st = "this gives a field";
			st = "this sentence is a run-on";
			st = "for all but finitely many ideals $I$ ";
			st = "Pure ideals are determined by their vanishing locus.";
			st = "for all but finitely many I";
			st = "if $R$ is a Noetherian ring and $M$ is a Cohen-Macaulay $R$-module with $text{Supp}(M) = Spec(R)$";
			st = "ring is topological if and only if ring is topological";
			
			//st = "a field with extension $Q_2$ ";
			//st = "if $R$ is noetherian, $M$ is also noetherian";
			//st = "this is not coherent"; 
			//st = "for every $s in S$ we have a group";
			//st = "vanishing locus";
			//st = "fields are determined ";
			//st = "topological ideal";
			//st = "$I$ proper";
			//st = "Pure ideals are determined by their vanishing locus.";
			//st = "field are perfect and fields are rings";
			//st = "fields are fields and fields are rings";			
			//st = "assume there exists a module with $M = R$";
			//st = "this topological and perfect field";
			//st = "for subset S of A";
			//st = "for field of F"; //......
			//st = "for field";
			//st = "for field extension of G";
			st = "Let $x$ be an element of $R^n$";
			st = "Let G be a group and p be a prime";
			st = "let G be a field and R be a ring";
			//st = "there exists a field";
			//st = "both pairs are perfect";
			//st = "F is a field and $F = 4$";
			//Maps.readLexicon();
			st = "this is less than C";
			st = "inverse image of B in M";
			st = "for some submodule $MM$, where $MM$ is a submodule of N";
			st = "where $m$ is an element of $M$";
			//st = "if $m$ is an integer where $m$ is an element of $M$";
			st = "take the derivative of f";
			st = "derivative of f";
			//st = "let f be an element of a field";
			//st = "take the union of subsets of F";
			//st = "$m$ is an element of $M$";
			//st = "where $MM$ is a element of N";
			//st = "let S be the union of elements of a field"; //***
			//st = "let $a$ or $b$ be elements of a field";
			//st = "let $s \\subset S$ be an element of a set";
			//st = " B or C is true";
			st = "take the log of derivative of f"; 
			st = "$f$ is element of $f$";
			st = "$R$ is determined by its ideals";
			st = "let $R$ be a ring";
			st = "we say that f is a field";
			st = "Let $R \\to S$ be an epimorphism of rings.";
			st = "there exists a function f such that f is constant";
			
			st = "A ring map is surjective if and only if it is finite";
			st = "a ring is it is finite"; //ensure pronoun doesn't refer to previous ent!
			st = "f is an element of G";
			st = "there exists a function f such that f is holomorphic";
			//st = "f is an element of $R^n$";
			//st = "$R \to S$ is surjective ";
			
			st = "the rank of f is at most n";
			st = "f belongs to a finite set";
			//st = "f is at most g";
			//st = "let f be g";
			//st = "there exists a universal property";
			//st = "f is an element of a set";
			st = "take derivative of log of f"; //***
			st = "if $f=\\sum_i i$ has radius of convergence $r$, then $f$ is holomorphic on $D(0, r)$";
			
			st = "f is a function, f has root at 0";
			st = "if $f(z) = \\sum a_n z^n $ has radius of convergence $r$, then the function $f$ is holomorphic on $D(0, r)$,";
			//st = "Let $f(T) = a_1T + ...$ be a formal power series with $a_1 \\ne 0$, then there exists a unique power series $g(T)$ where $f(g(T)) = T$;";
			st = "$f(z)$ has radius of convergence $r$ and zeros along $z = 1/2$";
			//st = "f has radius of convergence r and zeros";
			//st = "matrix $M$";
			//st = "radius of convergence";
			//st = "formal power series";
			st = "the derivative of $f$ is equal to $\\sum na_n z^{n-1}$";
			st = "A ring map is surjective if and only if it is a finite epimorphism";
			st = "If $f(z) = a_0 + \\sum_n a_n(z-z_0)^n$ is analytic at $z_0$, then there exists a local analytic isomorphism $\\phi$ at 0, such that $f(z) = a_0 + \\phi(z-z_0)^m$ ";
			st = "the derivative of the log of $x$ is equal to $1/x$";
			//st = "derivative of log of f is g";
			//st = "radius of convergence of f is r";
			//st = "f has radius of convergence r";
			st = "Let $f(T) = a_1T + ...$ be a formal power series with $a_1 \\ne 0$, "
					+ "then there exists a unique power series $g(T)$ such that $f(g(T)) = T$";
			st = "the cardinality of the set $S$ is at most the cardinality of the set $R$"; 
			st = "f is a function and f has zeros";
			st = "this field is perfect, it has order $p$";
			st = "f is holomorphic on D";
			st = "if all its local rings are cohen-macaulay";
			st = "we have f as a function of x";
			st = "$I$ is pure";
			st = "A Noetherian ring $R$ is called Cohen-Macaulay if all local rings are Cohen-Macaulay."; //******<---
			st = "there exists a field with $F$ maximal and $K$ free"; //<-- revisit!
			st = "Suppose $R$ is a Cohen-Macaulay local ring. For any prime $p$ the ring $R$ is Cohen-Macaulay as well.";
			st = "for any prime p $R$ is a ring";
			st = "suppose $R$ is a ring";
			st = "$R$ is catenary if and only if $R/\\mathfrak p$ is catenary for every minimal prime $\\mathfrak p$.";
			st = "$R$ is universally catenary if and only if $R/\\mathfrak p$ is universally catenary for every minimal prime $\\mathfrak p$.";			
			st = "$R/\\mathfrak p$ is catenary for every minimal prime $\\mathfrak p$";
			st = "Any quotient over a (universally) catenary ring is (universally) catenary.";
			st = "$R_\\mathfrak m$ is universally catenary for all maximal ideals $\\mathfrak m$";
			st = "A ring $R$ is said to be  universally catenary if $R$ is Noetherian and every $R$ algebra of finite type is catenary."; //****Need revisit
			st = "A ring $R$ is catenary if and only if the topological space $\\Spec(R)$ is catenary";
			st = "if and only if $P$ is prime";
			st = "regular rings are regular";
			st = "$R/\\mathfrak p$ is catenary for every minimal prime $\\mathfrak p$";
			st = "f is a function with radius of convergence r and finitely many roots";			
			st = "all maximal chains of primes $\\mathfrak p = \\mathfrak q$ have the same (finite) length";
			st = "$M/gM$ is Cohen-Macaulay with maximal regular sequence $f_1, \\ldots, f_{d-1}$.";
			st = "$M/gM$ is Cohen-Macaulay with maximal regular sequence $f_1, \\ldots, f_{d-1}$.";
			st = "$R/\\mathfrak p$ is catenary for every minimal prime $\\mathfrak p$";
			st = "$R_\\mathfrak m$ is universally catenary for all maximal ideals $\\mathfrak m$";
			st = "disjoint finite chains of primes $\\mathfrak p = \\mathfrak q$ have the same length";
			st = "minimal polynomial of degree $p$, whose coefficients are real";			
			st = "f is a function with radius of convergence r and finitely many roots"; 
			st = "f is a function with pole and finitely many roots";
			
			st = "whose coefficients are finite";	
			st = "finite coefficients";
			st = "Here the right hand side is the set of $n$-tuples $(beta_n)$ of elements of $overline{F}$ such that $beta_i$ is a root of $P_ivarphi$.";
			st = "here right hand side is the set";
			st = "The {it compositum of $K$ and $L$ in $Omega$} written $KL$.";
			st = "definition linearly disjoint. Consider a diagram of fields as in (equation inside omega). We say that $K$ and $L$ are linearly disjoint over $k$ in $Omega$ if the map $$ K $$ is injective.. Consider a diagram of fields as in (equation-inside-omega). We say that $K$ and $L$ are linearly disjoint over $k$ in $Omega$ if the map $$  y_i $$ is injective.";
			st = "finite extension";
			st = "definition algebraic";
			
			st = "f is a function with perfect";
			st = "a field is a ring";
			st = "i' $r$ item as an abelian group for $m in M_i$ and $m' in M_{i'}$ we define the sum of the classes of $m$ and $m'$ in $M$ to be the class of $mu_{ij}(m) + mu_{i'j}(m')$ where $j  I$ is any index with $i q j$ and $i' leq j$";
			st = "Let $R$ be a ring. Let $S subset R$ be a multiplicative subset. ";
			st = "The category of $S^{-1}R$-modules is equivalent to the category "
					+ "of $R$-modules $N$ with the property that every $s in S$ acts as an automorphism on $N$.";
			st = "A Noetherian domain of characteristic zero is N-1 if and only if it is N-2 (i.e., Japanese).";
			st = "$X$ has a basis for the topology consisting of quasi-compact opens";
			st = "lemma-topology-spec:: Let $R$ be a ring. The topology on $X = Spec(R)$ has the following properties:   (*) $X$ is quasi-compact,  (*) $X$ has a basis for the topology consisting of quasi-compact opens, and  (*) the intersection of any two quasi-compact opens is quasi-compact. ";
			st = "This induces a 1-1 correspondence between open and closed subsets $U subset Spec(R)$ and idempotents $e in R$";
			st = "Let $R$ be a ring. A connected component of $Spec(R)$ is of the form $V(I)$, where $I$ is an ideal generated by idempotents such that every idempotent of $R$ either maps to $0$ or $1$ in $R I$.";
			st = "Let $R$ be a ring, it has maximal ideal $I$";			
			//st = "$B_p$ is a subspace of the vector space~$Z_p$. Thus we may  \\index{hpk@$H_p(K)$";
			//st = "\\xy qtriangle/{<-}`{<-}`{<--}/[B`\ftr F(A)`ftr F(A');u`f`\ftr F(tilde f)] morphism(1000,500)|r|/{<--}/<0,-500>[A`A';tilde f]   endxy end{equation}Some authors reverse the convention and call the morphism in~\ref{00078}co-universal and the one here universal.  Other authors, this one included,call both universal morphisms.";
			st = "$M/gM$ is Cohen-Macaulay with maximal regular sequence $f_1, \\ldots, f_{d-1}$.";			
			st = "$U$ is open without boundary";
			st = "abelian group is unique";
			st = "field F is contained in field H";
			st = "A maximal smooth atlas on a topological manifold $M$ is a  differential structure  structure differential differential structure on~$M$. A topological $n$-manifold which has been given a differential structure is a  smooth manifold  manifold smooth smooth $n$-manifold (or a  manifold differential  differential manifold differential $n$-manifold, or a  Cinfinity@$ C^infty$ (smooth) -manifold $ C^infty$ $n$-manifold).";
			st = "algebraically closed field";
			st = "Let $k subset K$ be a field extension. If $k$ is algebraically closed in $K$, then $K$ is geometrically irreducible over $k$.";
			st = "let $k$ be a separably algebraically closed field";
			st = "separably algebraically closed field";
			st = "Let $k subset K$ be a field extension.";			
			
			st = "consider a ring such that field is ring";
			st = "the log of derivative of $f$";
			st = "consider this ring such that field is separable algebraic";
			st = "Consider the subextension $k subset k' subset K$ such that $k subset k'$ is separable algebraic and $k' subset K$ is maximal with this property.";
			st = "If $K/k$ is a finitely generated field extension, then $[k' : k] < infty$.";
			st = "If $K/k$ is a finitely generated field extension";
			st = "Let $k subset K$ be an extension of fields.";
			st = "Then $text{Gal}(overline{k}/k)$ acts transitively on the primes of $overline{k} otimes_k K$.";
			st = "Let $R$, $S$ be $k$-algebras. If $Spec(R)$, and $Spec(S)$ are connected, then so is $Spec(R otimes_k S)$."; //<--revisit!
			st = "Let $k$ be a field. Let $R$ be a $k$-algebra. for every field extension $k \\subset k'$ the spectrum of $R \\otimes_k k'$ is connected";// and for every finite separable field extension $k subset k'$ the spectrum of $R otimes_k k'$ is connected.";
			st = "for every field extension $k \\subset k'$ the spectrum of $R \\otimes_k k'$ is connected";
			st = "If $S$ is geometrically connected over $k$, so is every $k$-subalgebra.";
			st = "A directed colimit of geometrically connected $k$-algebras is geometrically connected.";
			st = "The map $$ R \\longrightarrow R \\otimes_k S $$ induces a bijection on idempotents";
			st = "We say $S$ is geometrically integral over $k$ if for every field extension $k \\subset k'$ the ring of $S \\otimes_k k'$ is a domain.";
			st = "In this case $S$ is geometrically integral over $k$ if and only if $S$ is geometrically irreducible as well as geometrically reduced over $k$.";
			st = "$S$ is geometrically integral";
			st = "$S$ is perfectly integral";
			st = "Let $S$ be a geometrically integral $K$-algebra";
			st = "Let $R$ be a $k$-algebra and an integral domain";
			st = "Group $G$ acts on space $X$ by conjugation";
			st = "$s$ is an element of $X$";
			st = "Let $v : K^* to Gamma$ be a homomorphism of abelian groups such that $v(a + b) geq min(v(a), v(b))$ for $a, b in K$ with $a, b, a + b$ not zero.";
			st = "let $s$ and $t$ be elements, and $s$ is a point";
			st = "let $a, b$ be points with $a$ not zero";
			st = "$A$ is a ring with maximal ideal $ mathfrak m = 1$ and with group of units $ A^* = 0 . $";
			st = "$A$ is a ring with maximal ideal $$ mathfrak m = 1$$";
			st = "$A$ is ring";
			st = "$R$ is a ring with ideal $I$";
			st = "Ideals in $A$ correspond $1 - 1$ with ideals of $Gamma$.";
			
			st = "$A$ is $B$, and is $C$";
			st = "$f$ map ring to field";
			st = "This bijection is inclusion preserving, and maps prime ideals to prime ideals.";
			st = "$f$ map prime ideals to prime ideals";
			st = "A valuation ring is Noetherian if and only if it is a discrete valuation ring or a field";
			
			st = "Group $G$ acts on space $X$ by conjugation";
			st = "Any $F$-algebra map $f : E to E$ is an automorphism";
			st = " Let $A$, $A'$, $A_{fin}$, $B$, and $B_{fin}$ be the subsets of $Spec(S)$ introduced above.";			
			st = "for every element $x$";			
			st = "indexed family of morphisms";
			st = "If $x$ is a indexed family of vectors";
			
			st = "$C$ is an indexed family $x$ of morphisms";
			st = "relatively prime polynomials";
			st = "the group $G$ acts on the subgroup $H$ by conjugation";
			st = "A valuation ring is Noetherian if and only if it is a discrete valuation ring or a field";	
			st = "If $x$ is a summable indexed family of vectors";
			st = "if $R$ is commutative and $S$ is commutative";
			st = "if $R$ is a ring, $M$ is an $R$ module if $R$ is commutative";
			st = "if $R$ is commutative and $S$ is commutative";
			st = "if $R$ is commutative and $S$ is commutative, $S$ is abelian if $S$ is abelian";
			
			st = "the map $f$ is linear";
			//st = "$f$ maps $x$ to $y$";
			st = "if $R$ is a ring, $R$ is commutative if $S$ is commutative";
			//st = "$f$ maps $a$ to $b$";
			//st = "$f$ map ring";
			//st = "Group $G$ acts on space $X$";
			//st = "$F$ is field, so is $G$";
			//st = "regular local ring";
			//st = "Let $R$ be integral domain";
			//st = "$k subset k' subset K$ is a field";
			//st = "consider a ring such that field is separable algebraic and field is ring";
			//st = "$k subset k' subset K$ is field";
			//st = "$Z$ is a an open set in $X$";
			//st = "it gives a group between field and ring";
			//st = "field between field and ring";
			//st = "The category of $S^{-1}R$-modules is $R$-modules $N$ with the property that every $s in S$ acts as an automorphism on $N$.";
			//st = " and item as an $R$-module define for $m in M_i$ and $x in R$ the product of $x$ and the class of $m$ in $M$ to be the class of $xm$ in $M$.";
			//st = "$pth$ power in field";
			//st = "a field is a ring";
			//st = "Assume that $B$ is Noetherian and Cohen-Macaulay and that $\\mathfrak m_B = (\\mathfrak m_A) B}$"; //**<--revisit!
			//st = "ring $R_p$ is regular, for every $p$";
			//st = "$R/\\mathfrak p$ is catenary for every minimal prime $\\mathfrak p$";
			//st = "for every minimal prime $\\p$";
			
			//st = "quotient over ring is quotient";
			//st = "$f$ is holomorphic on $D(0, r)$, the derivative of $f$ is $\\sum_j j $";
			//st = "$r $ is catenary "; 
			//st = "$R$ is field if and only if it is a field";
			//st = "there exists a unique power series $g(T)$ such that $f(g(T)) = T$";			
			//st = "$f$ is holomorphic on $D(0, r)$, the derivative of $f$ is $\\sum_j j $";
			//st = "the derivative of the log of $x$ is equal to $1/x$";
			//st = "f has radius of convergence r";
			//st = "Holomorphic functions are analytic.";
			//st = "the map p is said to be a quotient map given  a subset U of Y is open in Y";
			//st = "given that a subset U of Y is open in Y";
			//st = "U is an open set in Y";
			//st = "let U be an open set in Y";
			//st = "subset U of Y is open in Y";
			//st = "log of f";
			//st = "given an element f of a set $S$"; 
			//st = "f is a function with radius of convergence r and finitely many roots";
			//st = "let S be the union of elements of a field";
			//st = "f is a function with radius of convergence r";			
			//st = "f is function with radius";
			//st = "$f$ is a set";
			//st = "the derivative is $f=s$";

			//System.out.println("from TexConverter: " + TexConverter.convert("let $m \\subset M$ be an element"));			
			
			strAr = ThmP1.preprocess(st);
			
			List<int[]> parseContextVecList = new ArrayList<int[]>();
			
			
			ParseState parseState = new ParseState();
			for(int i = 0; i < strAr.length; i++){
				//alternate commented out line to enable tex converter
				//ThmP1.parse(ThmP1.tokenize(TexConverter.convert(strAr[i].trim()) ));
				parseState = ThmP1.tokenize(strAr[i].trim(), parseState);
				parseState = ThmP1.parse(parseState);
				int[] curContextVec = ThmP1.getParseContextVector();
				parseContextVecList.add(curContextVec);
				//get context vector
				System.out.println("cur vec: " + Arrays.toString(curContextVec));
			}
			
			System.out.println("@@@" + parseState.getHeadParseStruct());
			
			//combine these vectors together, only add subsequent vector entry
			//if that entry is 0 in all previous vectors int[].
			int[] combinedVec = GenerateContextVector.combineContextVectors(parseContextVecList);
			System.out.println("combinedVec: " + Arrays.toString(combinedVec));
			
			String parsedOutput = ThmP1.getParseStructMapList().toString();
			//String parsedOutput = Arrays.toString(ThmP1.getParseStructMapList().toArray());			
			//String processedOutput = parsedOutput.replaceAll("MathObj", "MathObject").replaceAll("\\$([^$]+)\\$", "LaTEXMath[\"$1\"]")
					//.replaceAll("MathObject\\{([^}]+)\\}", "MathObject\\[$1\\]");					
			
			System.out.println("PARTS: " + parsedOutput);			
			System.out.println("****ParsedExpr ");
			for(ParsedPair pair : ThmP1.getParsedExpr()){
				System.out.println(pair);
			}
			
			boolean streamInput = false;
			if(streamInput){
				Scanner sc = new Scanner(System.in);
				String inputStr;
				while(sc.hasNextLine()){
					inputStr = sc.nextLine();
					parseInput(inputStr);
				}
				sc.close();
			}
			
			//System.out.println("****" + ThmP1.getParsedExpr() + "******");
			boolean processFile = false;
			
			if(processFile){
				Scanner sc = new Scanner(new File("src/thmp/data/test1.txt"));
				
				while(sc.hasNextLine()){
					String nextLine = sc.nextLine();
					st = nextLine;
					if(st.matches("^\\s*$")) continue;
					System.out.println("*~~~*");
					System.out.println(nextLine + "\n");
					//array of sentences separated by . or !
					strAr = ThmP1.preprocess(st);
					
					parseState = new ParseState();
					for(int i = 0; i < strAr.length; i++){
						//alternate commented out line to enable tex converter
						//ThmP1.parse(ThmP1.tokenize(TexConverter.convert(strAr[i].trim()) ));
						parseState = ThmP1.tokenize(strAr[i].trim(), parseState);
						parseState = ThmP1.parse(parseState);
					}
					System.out.println();
					
					//parsedOutput = Arrays.toString(ThmP1.getParseStructMapList().toArray());			
					parsedOutput = ThmP1.getParseStructMapList().toString();
					
					System.out.println("PARTS: " + parsedOutput);
					System.out.println("****ParsedExpr " + ThmP1.getParsedExpr());
					System.out.println("*~~~*");
				}
				
				//ThmP1.writeUnknownWordsToFile();
				//ThmP1.writeParsedExprToFile();
				sc.close();
			}
			//p1.parse(p1.tokenize(p1.preprocess("characteristic of Fp is p".split(" "))));
			
		}
		
		private static void parseInput(String inputStr){
			String[] strAr = ThmP1.preprocess(inputStr);
			
			List<int[]> parseContextVecList = new ArrayList<int[]>();
			
			ParseState parseState = new ParseState();
			for(int i = 0; i < strAr.length; i++){
				//alternate commented out line to enable tex converter
				//ThmP1.parse(ThmP1.tokenize(TexConverter.convert(strAr[i].trim()) ));
				parseState = ThmP1.tokenize(strAr[i].trim(), parseState);
				parseState = ThmP1.parse(parseState);
				int[] curContextVec = ThmP1.getParseContextVector();
				parseContextVecList.add(curContextVec);
				//get context vector
				System.out.println("cur vec: " + Arrays.toString(curContextVec));
			}
			
			//combine these vectors together, only add subsequent vector entry
			//if that entry is 0 in all previous vectors int[].
			int[] combinedVec = GenerateContextVector.combineContextVectors(parseContextVecList);
			System.out.println("combinedVec: " + Arrays.toString(combinedVec));
			
			String parsedOutput = ThmP1.getParseStructMapList().toString();
			//String parsedOutput = Arrays.toString(ThmP1.getParseStructMapList().toArray());			
			//String processedOutput = parsedOutput.replaceAll("MathObj", "MathObject").replaceAll("\\$([^$]+)\\$", "LaTEXMath[\"$1\"]")
					//.replaceAll("MathObject\\{([^}]+)\\}", "MathObject\\[$1\\]");					
			
			System.out.println("PARTS: " + parsedOutput);			
			System.out.println("****ParsedExpr ");
			for(ParsedPair pair : ThmP1.getParsedExpr()){
				System.out.println(pair);
			}
		}
}

// Generated from C:/Users/Leandro/IdeaProjects/Gramatica_Leandro/src/main/java/antlr4/gramatica.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracoes(gramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaFuncoes(gramaticaParser.ListaFuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(gramaticaParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(gramaticaParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(gramaticaParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoBool(gramaticaParser.ExpressaoBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoBool(gramaticaParser.TermoBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#chamarFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamarFuncao(gramaticaParser.ChamarFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(gramaticaParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComandos(gramaticaParser.ListaComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(gramaticaParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(gramaticaParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicao(gramaticaParser.ComandoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(gramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLista(gramaticaParser.ComandoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAlgoritmo(gramaticaParser.SubAlgoritmoContext ctx);
}
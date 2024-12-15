// Generated from C:/Users/Leandro/IdeaProjects/Gramatica_Leandro/src/main/java/antlr4/gramatica.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(gramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(gramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterListaFuncoes(gramaticaParser.ListaFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitListaFuncoes(gramaticaParser.ListaFuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(gramaticaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(gramaticaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(gramaticaParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(gramaticaParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(gramaticaParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(gramaticaParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoBool}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoBool(gramaticaParser.ExpressaoBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoBool}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoBool(gramaticaParser.ExpressaoBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void enterTermoBool(gramaticaParser.TermoBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void exitTermoBool(gramaticaParser.TermoBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#chamarFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamarFuncao(gramaticaParser.ChamarFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#chamarFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamarFuncao(gramaticaParser.ChamarFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(gramaticaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(gramaticaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(gramaticaParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(gramaticaParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(gramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(gramaticaParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(gramaticaParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(gramaticaParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(gramaticaParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(gramaticaParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(gramaticaParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(gramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(gramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoLista}.
	 * @param ctx the parse tree
	 */
	void enterComandoLista(gramaticaParser.ComandoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoLista}.
	 * @param ctx the parse tree
	 */
	void exitComandoLista(gramaticaParser.ComandoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(gramaticaParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(gramaticaParser.SubAlgoritmoContext ctx);
}
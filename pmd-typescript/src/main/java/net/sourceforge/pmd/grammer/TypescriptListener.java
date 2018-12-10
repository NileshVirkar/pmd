package net.sourceforge.pmd.grammer;

// Generated from Typescript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypescriptParser}.
 */
public interface TypescriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TypescriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TypescriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(TypescriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(TypescriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(TypescriptParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(TypescriptParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(TypescriptParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(TypescriptParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(TypescriptParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(TypescriptParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(TypescriptParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(TypescriptParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(TypescriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(TypescriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(TypescriptParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(TypescriptParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(TypescriptParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(TypescriptParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(TypescriptParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(TypescriptParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(TypescriptParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(TypescriptParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(TypescriptParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(TypescriptParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(TypescriptParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(TypescriptParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(TypescriptParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(TypescriptParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TypescriptParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TypescriptParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(TypescriptParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(TypescriptParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TypescriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TypescriptParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(TypescriptParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(TypescriptParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(TypescriptParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(TypescriptParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(TypescriptParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(TypescriptParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(TypescriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(TypescriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(TypescriptParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(TypescriptParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(TypescriptParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(TypescriptParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(TypescriptParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(TypescriptParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(TypescriptParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(TypescriptParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(TypescriptParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(TypescriptParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(TypescriptParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(TypescriptParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TypescriptParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TypescriptParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(TypescriptParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(TypescriptParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(TypescriptParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(TypescriptParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(TypescriptParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(TypescriptParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(TypescriptParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(TypescriptParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(TypescriptParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(TypescriptParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryCompilation(TypescriptParser.OrdinaryCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryCompilation(TypescriptParser.OrdinaryCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void enterModularCompilation(TypescriptParser.ModularCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void exitModularCompilation(TypescriptParser.ModularCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(TypescriptParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(TypescriptParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(TypescriptParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(TypescriptParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(TypescriptParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(TypescriptParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(TypescriptParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(TypescriptParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(TypescriptParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(TypescriptParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(TypescriptParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(TypescriptParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(TypescriptParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(TypescriptParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(TypescriptParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(TypescriptParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(TypescriptParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(TypescriptParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(TypescriptParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(TypescriptParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(TypescriptParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(TypescriptParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TypescriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TypescriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(TypescriptParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(TypescriptParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(TypescriptParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(TypescriptParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(TypescriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(TypescriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(TypescriptParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(TypescriptParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(TypescriptParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(TypescriptParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(TypescriptParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(TypescriptParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(TypescriptParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(TypescriptParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TypescriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TypescriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(TypescriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(TypescriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(TypescriptParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(TypescriptParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(TypescriptParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(TypescriptParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(TypescriptParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(TypescriptParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(TypescriptParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(TypescriptParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(TypescriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(TypescriptParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(TypescriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(TypescriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(TypescriptParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(TypescriptParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(TypescriptParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(TypescriptParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(TypescriptParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(TypescriptParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(TypescriptParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(TypescriptParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(TypescriptParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(TypescriptParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(TypescriptParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(TypescriptParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(TypescriptParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(TypescriptParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(TypescriptParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(TypescriptParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(TypescriptParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(TypescriptParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(TypescriptParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(TypescriptParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(TypescriptParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(TypescriptParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(TypescriptParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(TypescriptParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(TypescriptParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(TypescriptParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(TypescriptParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(TypescriptParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(TypescriptParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(TypescriptParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(TypescriptParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(TypescriptParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(TypescriptParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(TypescriptParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(TypescriptParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(TypescriptParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(TypescriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(TypescriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(TypescriptParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(TypescriptParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(TypescriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(TypescriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(TypescriptParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(TypescriptParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(TypescriptParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(TypescriptParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(TypescriptParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(TypescriptParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(TypescriptParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(TypescriptParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(TypescriptParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(TypescriptParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(TypescriptParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(TypescriptParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(TypescriptParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(TypescriptParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(TypescriptParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(TypescriptParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(TypescriptParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(TypescriptParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(TypescriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(TypescriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(TypescriptParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(TypescriptParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(TypescriptParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(TypescriptParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(TypescriptParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(TypescriptParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(TypescriptParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(TypescriptParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(TypescriptParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(TypescriptParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(TypescriptParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(TypescriptParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(TypescriptParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(TypescriptParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(TypescriptParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(TypescriptParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(TypescriptParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(TypescriptParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(TypescriptParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(TypescriptParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(TypescriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(TypescriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(TypescriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(TypescriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(TypescriptParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(TypescriptParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(TypescriptParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(TypescriptParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(TypescriptParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(TypescriptParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(TypescriptParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(TypescriptParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(TypescriptParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(TypescriptParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(TypescriptParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(TypescriptParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(TypescriptParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(TypescriptParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(TypescriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(TypescriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(TypescriptParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(TypescriptParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(TypescriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(TypescriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(TypescriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(TypescriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(TypescriptParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(TypescriptParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(TypescriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(TypescriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(TypescriptParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(TypescriptParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(TypescriptParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(TypescriptParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(TypescriptParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(TypescriptParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(TypescriptParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(TypescriptParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(TypescriptParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(TypescriptParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(TypescriptParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(TypescriptParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(TypescriptParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(TypescriptParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(TypescriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(TypescriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(TypescriptParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(TypescriptParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(TypescriptParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(TypescriptParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(TypescriptParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(TypescriptParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(TypescriptParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(TypescriptParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(TypescriptParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(TypescriptParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TypescriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TypescriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(TypescriptParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(TypescriptParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(TypescriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(TypescriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(TypescriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(TypescriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(TypescriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(TypescriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TypescriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TypescriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(TypescriptParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(TypescriptParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(TypescriptParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(TypescriptParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(TypescriptParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(TypescriptParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(TypescriptParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(TypescriptParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(TypescriptParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(TypescriptParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TypescriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TypescriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(TypescriptParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(TypescriptParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(TypescriptParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(TypescriptParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(TypescriptParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(TypescriptParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(TypescriptParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(TypescriptParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(TypescriptParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(TypescriptParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(TypescriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(TypescriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(TypescriptParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(TypescriptParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(TypescriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(TypescriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(TypescriptParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(TypescriptParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(TypescriptParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(TypescriptParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(TypescriptParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(TypescriptParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TypescriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TypescriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(TypescriptParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(TypescriptParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(TypescriptParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(TypescriptParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TypescriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TypescriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(TypescriptParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(TypescriptParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(TypescriptParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(TypescriptParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(TypescriptParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(TypescriptParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(TypescriptParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(TypescriptParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(TypescriptParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(TypescriptParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(TypescriptParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(TypescriptParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(TypescriptParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(TypescriptParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(TypescriptParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(TypescriptParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(TypescriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(TypescriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(TypescriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(TypescriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TypescriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TypescriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(TypescriptParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(TypescriptParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(TypescriptParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(TypescriptParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(TypescriptParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(TypescriptParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(TypescriptParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(TypescriptParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(TypescriptParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(TypescriptParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(TypescriptParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(TypescriptParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(TypescriptParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(TypescriptParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(TypescriptParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(TypescriptParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(TypescriptParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(TypescriptParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(TypescriptParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(TypescriptParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(TypescriptParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(TypescriptParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(TypescriptParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(TypescriptParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(TypescriptParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(TypescriptParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TypescriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TypescriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(TypescriptParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(TypescriptParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(TypescriptParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(TypescriptParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(TypescriptParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(TypescriptParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(TypescriptParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(TypescriptParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(TypescriptParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(TypescriptParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(TypescriptParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(TypescriptParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(TypescriptParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(TypescriptParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(TypescriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(TypescriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(TypescriptParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(TypescriptParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(TypescriptParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(TypescriptParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(TypescriptParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(TypescriptParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(TypescriptParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(TypescriptParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(TypescriptParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(TypescriptParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(TypescriptParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(TypescriptParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(TypescriptParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(TypescriptParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(TypescriptParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(TypescriptParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(TypescriptParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(TypescriptParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TypescriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TypescriptParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(TypescriptParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(TypescriptParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(TypescriptParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(TypescriptParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(TypescriptParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(TypescriptParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(TypescriptParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(TypescriptParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(TypescriptParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(TypescriptParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(TypescriptParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(TypescriptParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(TypescriptParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(TypescriptParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TypescriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TypescriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(TypescriptParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(TypescriptParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(TypescriptParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(TypescriptParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(TypescriptParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(TypescriptParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(TypescriptParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(TypescriptParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(TypescriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(TypescriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TypescriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TypescriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(TypescriptParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(TypescriptParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TypescriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TypescriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TypescriptParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TypescriptParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(TypescriptParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(TypescriptParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(TypescriptParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(TypescriptParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(TypescriptParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(TypescriptParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(TypescriptParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(TypescriptParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(TypescriptParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(TypescriptParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TypescriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TypescriptParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TypescriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TypescriptParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(TypescriptParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(TypescriptParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TypescriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TypescriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TypescriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TypescriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TypescriptParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TypescriptParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(TypescriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(TypescriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(TypescriptParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(TypescriptParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(TypescriptParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(TypescriptParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(TypescriptParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(TypescriptParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(TypescriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(TypescriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(TypescriptParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(TypescriptParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(TypescriptParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(TypescriptParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(TypescriptParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(TypescriptParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(TypescriptParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(TypescriptParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypescriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TypescriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypescriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TypescriptParser.IdentifierContext ctx);
}
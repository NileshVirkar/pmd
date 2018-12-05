package net.sourceforge.pmd.grammer;

// Generated from Typescript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypescriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypescriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TypescriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(TypescriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(TypescriptParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(TypescriptParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(TypescriptParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(TypescriptParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(TypescriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(TypescriptParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(TypescriptParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(TypescriptParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(TypescriptParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(TypescriptParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(TypescriptParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(TypescriptParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(TypescriptParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(TypescriptParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TypescriptParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(TypescriptParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(TypescriptParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(TypescriptParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(TypescriptParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(TypescriptParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(TypescriptParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(TypescriptParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(TypescriptParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(TypescriptParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(TypescriptParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TypescriptParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(TypescriptParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(TypescriptParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(TypescriptParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(TypescriptParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TypescriptParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryCompilation(TypescriptParser.OrdinaryCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#modularCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularCompilation(TypescriptParser.ModularCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(TypescriptParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(TypescriptParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(TypescriptParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(TypescriptParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(TypescriptParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(TypescriptParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(TypescriptParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(TypescriptParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(TypescriptParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(TypescriptParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(TypescriptParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TypescriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(TypescriptParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(TypescriptParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(TypescriptParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(TypescriptParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(TypescriptParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(TypescriptParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(TypescriptParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TypescriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(TypescriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(TypescriptParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(TypescriptParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(TypescriptParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(TypescriptParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(TypescriptParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(TypescriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(TypescriptParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(TypescriptParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(TypescriptParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(TypescriptParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(TypescriptParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(TypescriptParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(TypescriptParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(TypescriptParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(TypescriptParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(TypescriptParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(TypescriptParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(TypescriptParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(TypescriptParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(TypescriptParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(TypescriptParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(TypescriptParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(TypescriptParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(TypescriptParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(TypescriptParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(TypescriptParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(TypescriptParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(TypescriptParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(TypescriptParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(TypescriptParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(TypescriptParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(TypescriptParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(TypescriptParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(TypescriptParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(TypescriptParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(TypescriptParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(TypescriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(TypescriptParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(TypescriptParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(TypescriptParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(TypescriptParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(TypescriptParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(TypescriptParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(TypescriptParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(TypescriptParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(TypescriptParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(TypescriptParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(TypescriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(TypescriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(TypescriptParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(TypescriptParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(TypescriptParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(TypescriptParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(TypescriptParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(TypescriptParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(TypescriptParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(TypescriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(TypescriptParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(TypescriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(TypescriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(TypescriptParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(TypescriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(TypescriptParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(TypescriptParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(TypescriptParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(TypescriptParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(TypescriptParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(TypescriptParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(TypescriptParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(TypescriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(TypescriptParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(TypescriptParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(TypescriptParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(TypescriptParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(TypescriptParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TypescriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(TypescriptParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TypescriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(TypescriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(TypescriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TypescriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(TypescriptParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(TypescriptParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(TypescriptParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(TypescriptParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(TypescriptParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TypescriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(TypescriptParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(TypescriptParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(TypescriptParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(TypescriptParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(TypescriptParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(TypescriptParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(TypescriptParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(TypescriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(TypescriptParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(TypescriptParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(TypescriptParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TypescriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(TypescriptParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(TypescriptParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TypescriptParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(TypescriptParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(TypescriptParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(TypescriptParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(TypescriptParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(TypescriptParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(TypescriptParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(TypescriptParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(TypescriptParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(TypescriptParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(TypescriptParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TypescriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(TypescriptParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(TypescriptParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(TypescriptParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(TypescriptParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(TypescriptParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(TypescriptParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(TypescriptParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(TypescriptParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(TypescriptParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(TypescriptParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(TypescriptParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(TypescriptParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(TypescriptParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TypescriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(TypescriptParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(TypescriptParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(TypescriptParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(TypescriptParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(TypescriptParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(TypescriptParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(TypescriptParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(TypescriptParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(TypescriptParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(TypescriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(TypescriptParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(TypescriptParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(TypescriptParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(TypescriptParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(TypescriptParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(TypescriptParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(TypescriptParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(TypescriptParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(TypescriptParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(TypescriptParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(TypescriptParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(TypescriptParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(TypescriptParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(TypescriptParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(TypescriptParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(TypescriptParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(TypescriptParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TypescriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(TypescriptParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(TypescriptParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(TypescriptParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(TypescriptParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TypescriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TypescriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(TypescriptParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(TypescriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(TypescriptParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(TypescriptParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(TypescriptParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(TypescriptParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(TypescriptParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(TypescriptParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TypescriptParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TypescriptParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(TypescriptParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TypescriptParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TypescriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TypescriptParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(TypescriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(TypescriptParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(TypescriptParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(TypescriptParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(TypescriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(TypescriptParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(TypescriptParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(TypescriptParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(TypescriptParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypescriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TypescriptParser.IdentifierContext ctx);
}
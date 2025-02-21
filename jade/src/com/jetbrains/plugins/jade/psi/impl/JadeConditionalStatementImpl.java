// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.jetbrains.plugins.jade.psi.impl;

import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.CompositePsiElement;
import com.jetbrains.plugins.jade.psi.JadeElementTypes;
import com.jetbrains.plugins.jade.psi.JadeTokenTypes;
import org.jetbrains.annotations.Nullable;

public class JadeConditionalStatementImpl extends CompositePsiElement {
  public JadeConditionalStatementImpl() {
    super(JadeElementTypes.CONDITIONAL_STATEMENT);
  }

  public @Nullable PsiElement getBody() {
    return findPsiChildByType(JadeElementTypes.CONDITIONAL_BODY);
  }

  public @Nullable PsiElement getHeader() {
    return findPsiChildByType(JadeElementTypes.CONDITIONAL_HEADER);
  }
}

// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.jetbrains.plugins.jade;

// import com.intellij.testFramework.fixtures.IdeaTestExecutionPolicy;

import java.io.File;

public class JadeTestUtil {

  public static String getBaseTestDataPath() {
    String contribPath = getContribPath();
    return contribPath + "/jade/testData/";
  }

  public static String getLexerTestDirPath() {
    return getBaseTestDataPath().substring("/home/connor/Development/intellij-plugins".length());
  }

  public static String getContribPath() {
    final String homePath = "/home/connor/Development/intellij-plugins";
    if (new File(homePath, "contrib/.gitignore").isFile()) {
      return homePath + File.separatorChar + "contrib";
    }
    return homePath;
  }

}

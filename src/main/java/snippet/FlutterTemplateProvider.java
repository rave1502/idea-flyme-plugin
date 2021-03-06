package snippet;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class FlutterTemplateProvider implements DefaultLiveTemplatesProvider {
  @Override
  public String[] getDefaultLiveTemplateFiles() {
    return new String[] {"templates/Dart", "templates/Flutter"};
  }

  @Nullable
  @Override
  public String[] getHiddenLiveTemplateFiles() {
    return new String[0];
  }
}

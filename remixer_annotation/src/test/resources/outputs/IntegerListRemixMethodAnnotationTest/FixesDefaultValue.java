/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package somepackage;

import com.google.android.libraries.remixer.Callback;
import com.google.android.libraries.remixer.ItemListVariable;
import com.google.android.libraries.remixer.Remixer;
import com.google.android.libraries.remixer.Variable;
import com.google.android.libraries.remixer.annotation.RemixerBinder;
import java.lang.Integer;
import java.lang.Override;
import java.util.ArrayList;

/**
 * This class was generated by RemixerAnnotationProcessor */
public class FixesDefaultValue_RemixerBinder implements RemixerBinder.Binder<FixesDefaultValue> {
  @Override
  public void bindInstance(FixesDefaultValue activity) {
    Remixer remixer;
    if (activity.remixer == null) {
      remixer = new Remixer();
    } else {
      remixer = activity.remixer;
    }
    ArrayList<Integer> fixValue_variable_list = new ArrayList<Integer>();
    fixValue_variable_list.add(1);
    fixValue_variable_list.add(2);
    Generated_fixValue fixValue_callback = new Generated_fixValue(activity);
    ItemListVariable<Integer> fixValue_variable = new ItemListVariable<Integer>("fixValue", "fixValue", 1, fixValue_variable_list, activity, fixValue_callback, 0);
    fixValue_variable.init();
    remixer.addItem(fixValue_variable);
    activity.remixer = remixer;
  }

  static class Generated_fixValue implements Callback<Integer> {
    private final FixesDefaultValue activity;

    Generated_fixValue(FixesDefaultValue activity) {
      this.activity = activity;
    }

    @Override
    public void onValueSet(Variable<Integer> variable) {
      activity.fixValue(variable.getSelectedValue());
    }
  }
}

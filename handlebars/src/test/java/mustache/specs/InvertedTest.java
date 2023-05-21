/**
 * Copyright (c) 2012 Edgar Espina
 *
 * This file is part of Handlebars.java.
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
package mustache.specs;

import java.io.IOException;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

public class InvertedTest extends SpecTest {

  public InvertedTest(final Spec spec) {
    super(spec);
  }

  @Parameters
  public static Collection<Object[]> data() throws IOException {
    return data("inverted.yml");
  }
}

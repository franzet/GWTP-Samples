/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.samples.hplace.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.gwtplatform.samples.hplace.client.gin.ClientGinjector;

/**
 * @author Christian Goudreau
 */
public class Gwtphplacesample implements EntryPoint {
  public final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

  @Override
  public void onModuleLoad() {
    // This is required for Gwt-Platform proxy's generator.
    DelayedBindRegistry.bind(ginjector);

    ginjector.getPlaceManager().revealCurrentPlace();
  }
}
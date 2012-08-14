/**
 * Copyright 2011-2012 Xeiam LLC.
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
package com.xeiam.xchart;

import java.awt.Color;

/**
 * @author timmolter
 */
public enum ChartColor {

  /** BLACK */
  BLACK(new Color(0, 0, 0)),

  /** WHITE */
  WHITE(new Color(255, 255, 255)),

  /** DARK_GREY */
  DARK_GREY(new Color(22, 22, 22)),

  /** GREY */
  GREY(new Color(200, 200, 200)),

  /** LIGHT_GREY */
  LIGHT_GREY(new Color(252, 252, 252));

  Color color;

  protected static Color getAWTColor(ChartColor chartColor) {

    return chartColor.color;
  }

  /**
   * Constructor
   * 
   * @param color
   */
  private ChartColor(Color color) {

    this.color = color;
  }

}

package com.cyd.project.design.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 16:31
 * @ClassName Switch
 * @Version: 1.0
 */
public class Switch {
   private List<Command> history = new ArrayList<>();

   public Switch() {
   }

   public void storeAndExecute(Command cmd) {
      // optional
      this.history.add(cmd);
      cmd.execute();        
   }
}
package com.ejava.chapter08;

import java.util.Optional;

public class ParentProcessEx {
  public static void main(String[] args) {
    ProcessHandle ph = ProcessHandle.current();
    Optional<ProcessHandle> parentProcess = ph.parent();
    System.out.println("부모 PID: " + (parentProcess.isPresent() ? String.valueOf(parentProcess.get().pid()) : "N/A"));

    // 같은 기능을 Optional의 map를 이용해 개선한 코드
    System.out.println("부모 PID: " + ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));
  }
}

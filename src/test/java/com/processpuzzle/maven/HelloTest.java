package com.processpuzzle.maven;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class HelloTest {
   @Test public void echo_returnsSentMessage(){
      Hello hello = new Hello();
      assertThat( hello.echo( "Any text" ), equalTo( "Any text" ));
   }
}

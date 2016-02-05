/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.sample.mvc")
@EnableWebMvc

public class BaseTestConfig {static class __CLR3_1_121v1vik9ns83g{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0045\u004d\u0053\u005f\u004a\u0061\u0076\u0061\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1454674744017L,8589935092L,73,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	
	@Bean
	public UrlBasedViewResolver setupViewResolver() {try{__CLR3_1_121v1vik9ns83g.R.inc(67);
		__CLR3_1_121v1vik9ns83g.R.inc(68);UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		__CLR3_1_121v1vik9ns83g.R.inc(69);resolver.setPrefix("/webapp/jsp/");
		__CLR3_1_121v1vik9ns83g.R.inc(70);resolver.setSuffix(".jsp");
		__CLR3_1_121v1vik9ns83g.R.inc(71);resolver.setViewClass(JstlView.class);
		__CLR3_1_121v1vik9ns83g.R.inc(72);return resolver;
	}finally{__CLR3_1_121v1vik9ns83g.R.flushNeeded();}}

}
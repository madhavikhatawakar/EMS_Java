/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sample.mvc.model.EmployeeCommand;

public class EmployeeDAOImpl implements EmployeeDAO{public static class __CLR3_1_12jjik9ns7yh{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0045\u004d\u0053\u005f\u004a\u0061\u0076\u0061\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1454674743671L,8589935092L,34,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	@Autowired
    private SessionFactory sessionFactory;
	
	public void addEmployee(EmployeeCommand employee) {try{__CLR3_1_12jjik9ns7yh.R.inc(19);
		 __CLR3_1_12jjik9ns7yh.R.inc(20);this.sessionFactory.getCurrentSession().save(employee);
	}finally{__CLR3_1_12jjik9ns7yh.R.flushNeeded();}}

	public void deleteEmployee(Integer employeeId) {try{__CLR3_1_12jjik9ns7yh.R.inc(21);
		__CLR3_1_12jjik9ns7yh.R.inc(22);EmployeeCommand employee = (EmployeeCommand) sessionFactory.getCurrentSession().load(EmployeeCommand.class, employeeId);
        __CLR3_1_12jjik9ns7yh.R.inc(23);if ((((null != employee)&&(__CLR3_1_12jjik9ns7yh.R.iget(24)!=0|true))||(__CLR3_1_12jjik9ns7yh.R.iget(25)==0&false))) {{
            __CLR3_1_12jjik9ns7yh.R.inc(26);this.sessionFactory.getCurrentSession().delete(employee);
        }
	}}finally{__CLR3_1_12jjik9ns7yh.R.flushNeeded();}}
	
	public List<EmployeeCommand> listContact() {try{__CLR3_1_12jjik9ns7yh.R.inc(27);
		  __CLR3_1_12jjik9ns7yh.R.inc(28);return sessionFactory.getCurrentSession().createQuery("from EmployeeCommand").list();
	}finally{__CLR3_1_12jjik9ns7yh.R.flushNeeded();}}

	public EmployeeCommand getEmployeebyId(Integer employeeId) {try{__CLR3_1_12jjik9ns7yh.R.inc(29);
		__CLR3_1_12jjik9ns7yh.R.inc(30);EmployeeCommand empCmd = (EmployeeCommand) this.sessionFactory.getCurrentSession().get(EmployeeCommand.class, employeeId);
		__CLR3_1_12jjik9ns7yh.R.inc(31);return empCmd;
	}finally{__CLR3_1_12jjik9ns7yh.R.flushNeeded();}}

	public void updateEmployee(EmployeeCommand employeeCommand) {try{__CLR3_1_12jjik9ns7yh.R.inc(32);
		__CLR3_1_12jjik9ns7yh.R.inc(33);this.sessionFactory.getCurrentSession().update(employeeCommand);
	}finally{__CLR3_1_12jjik9ns7yh.R.flushNeeded();}}

	

}

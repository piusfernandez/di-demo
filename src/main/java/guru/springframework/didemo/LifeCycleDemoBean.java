package guru.springframework.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements 
		BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	public LifeCycleDemoBean() {
		System.out.println("## LifyCycleDemoBean constructor!");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("##BeanNameAware::setBeanName() Bean name is " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("##BeanFactoryAware::setBeanFactory() bean factory has been set!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("##InitializingBean::afterPropertiesSet() LifeCycleBean has its properties set!");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("##ApplicationContextAware::setApplicationContext() has been set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("##DisposableBean::destroy() LifeCycleBean has been terminated!");
	}
	
	@PostConstruct
	public void postContruct()	{
		System.out.println("##PostConstruct annotated method has been called!");
	}
	
	@PreDestroy
	public void preDestroy()	{
		System.out.println("##PreDestroy method has been called!");
	}

	public void beforeInit()	{
		System.out.println("##beforeInit() called by BeanPostProcessor");
	}
	
	public void afterInit()	{
		System.out.println("##afterInit() called by BeanPostProcessor");
	}
	
}

package lk.ijse.gdse68.introwith_springweb.introwithspringweb;

import lk.ijse.gdse68.introwith_springweb.introwithspringweb.config.WebAppConfig;
import lk.ijse.gdse68.introwith_springweb.introwithspringweb.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
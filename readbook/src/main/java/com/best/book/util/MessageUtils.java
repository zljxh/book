//package com.best.book.util;
//
//import org.springframework.boot.autoconfigure.web.WebProperties;
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.i18n.LocaleContextHolder;
//import org.springframework.stereotype.Component;
//
///**
// * 国际化工具类
// */
//@Component
//public class MessageUtils{
//
//    private static MessageSource messageSource;
//
//    public MessageUtils(MessageSource messageSource) {
//        FastL/**
//         * 配置国际化语言
//         */
//        @Configuration
//        public class LocaleConfig {
//
//            /**
//             * 默认解析器 其中locale表示默认语言
//             */
//            @Bean
//            public LocaleResolver localeResolver() {
//                SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//                localeResolver.setDefaultLocale(Locale.US);
//                return localeResolver;
//            }
//
//            /**
//             * 默认拦截器 其中lang表示切换语言的参数名
//             */
//            @Bean
//            public WebMvcConfigurer localeInterceptor() {
//                return new WebMvcConfigurer() {
//                    @Override
//                    public void addInterceptors(InterceptorRegistry registry) {
//                        LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
//                        localeInterceptor.setParamName("lang");
//                        registry.addInterceptor(localeInterceptor);
//                    }
//                };
//            }
//        }ocale.messageSource = messageSource;
//    }
//
//    /**
//     * 获取单个国际化翻译值
//     */
//    public static String get(String msgKey) {
//        try {
//            return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
//        } catch (Exception e) {
//            return msgKey;
//        }
//    }
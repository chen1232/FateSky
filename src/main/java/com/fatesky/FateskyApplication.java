package com.fatesky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FateskyApplication {
	
	public final static Logger logger = LoggerFactory.getLogger(FateskyApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FateskyApplication.class, args);
		logger.info("FateskyApplication is success!\n"+                 
				" ......................阿弥陀佛......................\n"+
                "                       _oo0oo_                      \n"+
                "                      o8888888o                     \n"+
                "                      88\" . \"88                     \n"+
                "                      (| -_- |)                     \n"+
                "                      0\\  =  /0                     \n"+
                "                   ___/‘---’\\___                   \n"+
                "                  .' \\|       |/ '.                 \n"+
                "                 / \\\\|||  :  |||// \\                \n"+
                "                / _||||| -卍-|||||_ \\               \n"+
                "               |   | \\\\\\  -  /// |   |              \n"+
                "               | \\_|  ''\\---/''  |_/ |              \n"+
                "               \\  .-\\__  '-'  ___/-. /              \n"+
                "             ___'. .'  /--.--\\  '. .'___            \n"+
                "         .\"\" ‘<  ‘.___\\_<|>_/___.’>’ \"\".          \n"+
                "       | | :  ‘- \\‘.;‘\\ _ /’;.’/ - ’ : | |        \n"+
                "         \\  \\ ‘_.   \\_ __\\ /__ _/   .-’ /  /        \n"+
                "    =====‘-.____‘.___ \\_____/___.-’___.-’=====     \n"+
                "                       ‘=---=’                      \n"+
                "                                                    \n"+
                "....................佛祖保佑 ,永无BUG...................");
	}
}


package ru.icl.bbcodeconverter.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Class Victim is the essence of the text, which is directly entered by the user and converted
 * from BBCode language to HTML.
 *
 * @author Danil Yusupov*/

@Component
public class Victim {
    /**
     * @param text
     *      Is the target text to be converted.
     * It's entering by the user.
     *
     * @param result
     *       Is the transformed text to goal value*/
    private String text;
    private String result;

    /**
     * @log is the simple logger, which is not tested yet =).
     */
    private static final Logger log = LoggerFactory.getLogger("BbcodeConverterApplication");

    public Victim() {
    }

    public Victim(String text) {
        this.text = text;
    }

    /**
     *
     * @param input
     *        Receives text from user
     * @return
     *        Transformed to HTML format String
     */
    public String convert(String input) {
        input = input.replace('[', '<');
        input = input.replace(']', '>');
        input = input.replace("<url", "<a href");
        input = input.replace("/url", "/a");
        //url = a href
        //url = /a
        return input;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setResult(String result) {
        this.result = convert(text);
    }

    public String getResult() {
        return result;
    }
}

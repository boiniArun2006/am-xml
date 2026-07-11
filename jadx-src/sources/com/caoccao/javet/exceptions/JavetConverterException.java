package com.caoccao.javet.exceptions;

import com.caoccao.javet.utils.SimpleMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetConverterException extends JavetException {
    protected JavetConverterException(JavetError javetError, Map<String, Object> map) {
        super(javetError, map);
    }

    public JavetConverterException(String str) {
        this(JavetError.ConverterFailure, SimpleMap.of("message", str));
    }

    public static JavetConverterException circularStructure(int i2) {
        return new JavetConverterException(JavetError.ConverterCircularStructure, SimpleMap.of(JavetError.PARAMETER_MAX_DEPTH, Integer.valueOf(i2)));
    }
}

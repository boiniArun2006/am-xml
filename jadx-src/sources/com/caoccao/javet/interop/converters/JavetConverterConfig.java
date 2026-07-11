package com.caoccao.javet.interop.converters;

import com.caoccao.javet.interop.binding.IClassProxyPlugin;
import com.caoccao.javet.interop.converters.JavetConverterConfig;
import com.caoccao.javet.interop.proxy.IJavetReflectionObjectFactory;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginArray;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginList;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginMap;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginSet;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class JavetConverterConfig<T extends JavetConverterConfig<T>> {
    public static final int DEFAULT_MAX_DEPTH = 20;
    protected boolean defaultBoolean = false;
    protected byte defaultByte = 0;
    protected char defaultChar = 0;
    protected double defaultDouble = 0.0d;
    protected float defaultFloat = 0.0f;
    protected int defaultInt = 0;
    protected long defaultLong = 0;
    protected short defaultShort = 0;
    protected boolean extractFunctionSourceCode = false;
    protected int maxDepth = 20;
    protected final List<IClassProxyPlugin> proxyPlugins = new ArrayList();
    protected IJavetReflectionObjectFactory reflectionObjectFactory = null;
    protected boolean sealedEnabled = false;
    protected boolean skipFunctionInObject = true;

    public static /* synthetic */ boolean J2(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginArray;
    }

    public static /* synthetic */ boolean KN(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginMap;
    }

    public static /* synthetic */ boolean O(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginSet;
    }

    public static /* synthetic */ boolean Uo(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginList;
    }

    public static /* synthetic */ boolean n(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginArray;
    }

    public static /* synthetic */ boolean nr(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginMap;
    }

    public static /* synthetic */ boolean rl(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginList;
    }

    public static /* synthetic */ boolean t(IClassProxyPlugin iClassProxyPlugin) {
        return iClassProxyPlugin instanceof JavetProxyPluginSet;
    }

    public boolean getDefaultBoolean() {
        return this.defaultBoolean;
    }

    public byte getDefaultByte() {
        return this.defaultByte;
    }

    public char getDefaultChar() {
        return this.defaultChar;
    }

    public double getDefaultDouble() {
        return this.defaultDouble;
    }

    public float getDefaultFloat() {
        return this.defaultFloat;
    }

    public int getDefaultInt() {
        return this.defaultInt;
    }

    public long getDefaultLong() {
        return this.defaultLong;
    }

    public short getDefaultShort() {
        return this.defaultShort;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public List<IClassProxyPlugin> getProxyPlugins() {
        return this.proxyPlugins;
    }

    public IJavetReflectionObjectFactory getReflectionObjectFactory() {
        return this.reflectionObjectFactory;
    }

    public boolean isExtractFunctionSourceCode() {
        return this.extractFunctionSourceCode;
    }

    public boolean isSealedEnabled() {
        return this.sealedEnabled;
    }

    public boolean isSkipFunctionInObject() {
        return this.skipFunctionInObject;
    }

    public JavetConverterConfig<T> setDefaultBoolean(boolean z2) {
        this.defaultBoolean = z2;
        return this;
    }

    public JavetConverterConfig<T> setDefaultByte(byte b2) {
        this.defaultByte = b2;
        return this;
    }

    public JavetConverterConfig<T> setDefaultChar(char c2) {
        this.defaultChar = c2;
        return this;
    }

    public JavetConverterConfig<T> setDefaultDouble(double d2) {
        this.defaultDouble = d2;
        return this;
    }

    public JavetConverterConfig<T> setDefaultFloat(float f3) {
        this.defaultFloat = f3;
        return this;
    }

    public JavetConverterConfig<T> setDefaultInt(int i2) {
        this.defaultInt = i2;
        return this;
    }

    public JavetConverterConfig<T> setDefaultLong(long j2) {
        this.defaultLong = j2;
        return this;
    }

    public JavetConverterConfig<T> setDefaultShort(short s2) {
        this.defaultShort = s2;
        return this;
    }

    public JavetConverterConfig<T> setExtractFunctionSourceCode(boolean z2) {
        this.extractFunctionSourceCode = z2;
        return this;
    }

    public JavetConverterConfig<T> setMaxDepth(int i2) {
        this.maxDepth = i2;
        return this;
    }

    public JavetConverterConfig<T> setProxyArrayEnabled(boolean z2) {
        if (!z2) {
            getProxyPlugins().removeIf(new Predicate() { // from class: com.caoccao.javet.interop.converters.n
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return JavetConverterConfig.J2((IClassProxyPlugin) obj);
                }
            });
            return this;
        }
        if (!isProxyArrayEnabled()) {
            getProxyPlugins().add(0, JavetProxyPluginArray.getInstance());
        }
        return this;
    }

    public JavetConverterConfig<T> setProxyListEnabled(boolean z2) {
        if (!z2) {
            getProxyPlugins().removeIf(new Predicate() { // from class: com.caoccao.javet.interop.converters.I28
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return JavetConverterConfig.Uo((IClassProxyPlugin) obj);
                }
            });
            return this;
        }
        if (!isProxyListEnabled()) {
            getProxyPlugins().add(0, JavetProxyPluginList.getInstance());
        }
        return this;
    }

    public JavetConverterConfig<T> setProxyMapEnabled(boolean z2) {
        if (!z2) {
            getProxyPlugins().removeIf(new Predicate() { // from class: com.caoccao.javet.interop.converters.w6
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return JavetConverterConfig.KN((IClassProxyPlugin) obj);
                }
            });
            return this;
        }
        if (!isProxyMapEnabled()) {
            getProxyPlugins().add(0, JavetProxyPluginMap.getInstance());
        }
        return this;
    }

    public JavetConverterConfig<T> setProxySetEnabled(boolean z2) {
        if (!z2) {
            getProxyPlugins().removeIf(new Predicate() { // from class: com.caoccao.javet.interop.converters.j
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return JavetConverterConfig.t((IClassProxyPlugin) obj);
                }
            });
            return this;
        }
        if (!isProxySetEnabled()) {
            getProxyPlugins().add(0, JavetProxyPluginSet.getInstance());
        }
        return this;
    }

    public JavetConverterConfig<T> setReflectionObjectFactory(IJavetReflectionObjectFactory iJavetReflectionObjectFactory) {
        this.reflectionObjectFactory = iJavetReflectionObjectFactory;
        return this;
    }

    public JavetConverterConfig<T> setSealedEnabled(boolean z2) {
        this.sealedEnabled = z2;
        return this;
    }

    public JavetConverterConfig<T> setSkipFunctionInObject(boolean z2) {
        this.skipFunctionInObject = z2;
        return this;
    }

    public boolean isProxyArrayEnabled() {
        return getProxyPlugins().stream().anyMatch(new Predicate() { // from class: com.caoccao.javet.interop.converters.Wre
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return JavetConverterConfig.n((IClassProxyPlugin) obj);
            }
        });
    }

    public boolean isProxyListEnabled() {
        return getProxyPlugins().stream().anyMatch(new Predicate() { // from class: com.caoccao.javet.interop.converters.fuX
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return JavetConverterConfig.rl((IClassProxyPlugin) obj);
            }
        });
    }

    public boolean isProxyMapEnabled() {
        return getProxyPlugins().stream().anyMatch(new Predicate() { // from class: com.caoccao.javet.interop.converters.CN3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return JavetConverterConfig.nr((IClassProxyPlugin) obj);
            }
        });
    }

    public boolean isProxySetEnabled() {
        return getProxyPlugins().stream().anyMatch(new Predicate() { // from class: com.caoccao.javet.interop.converters.Ml
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return JavetConverterConfig.O((IClassProxyPlugin) obj);
            }
        });
    }
}

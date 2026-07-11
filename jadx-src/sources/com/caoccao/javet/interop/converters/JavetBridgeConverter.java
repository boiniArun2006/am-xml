package com.caoccao.javet.interop.converters;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPlugin;
import com.caoccao.javet.interop.proxy.IJavetNonProxy;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginArray;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginClass;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginDefault;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginList;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginMap;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginSet;
import com.caoccao.javet.values.V8Value;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetBridgeConverter extends JavetProxyConverter {
    protected static final IClassProxyPlugin[] DEFAULT_PROXY_PLUGINS = {JavetProxyPluginMap.getInstance(), JavetProxyPluginSet.getInstance(), JavetProxyPluginList.getInstance(), JavetProxyPluginArray.getInstance(), JavetProxyPluginClass.getInstance(), JavetProxyPluginDefault.getInstance()};

    public JavetBridgeConverter() {
        Collections.addAll(getConfig().getProxyPlugins(), DEFAULT_PROXY_PLUGINS);
    }

    @Override // com.caoccao.javet.interop.converters.JavetProxyConverter, com.caoccao.javet.interop.converters.JavetObjectConverter, com.caoccao.javet.interop.converters.JavetPrimitiveConverter, com.caoccao.javet.interop.converters.BaseJavetConverter
    protected <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj, int i2) throws JavetException {
        validateDepth(i2);
        if (obj == null) {
            return v8Runtime.createV8ValueNull();
        }
        if (obj.getClass().isPrimitive()) {
            Class<?> cls = obj.getClass();
            if (cls == Integer.TYPE) {
                return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
            }
            if (cls == Boolean.TYPE) {
                return v8Runtime.createV8ValueBoolean(((Boolean) obj).booleanValue());
            }
            if (cls == Double.TYPE) {
                return v8Runtime.createV8ValueDouble(((Double) obj).doubleValue());
            }
            if (cls == Float.TYPE) {
                return v8Runtime.createV8ValueDouble(((Double) obj).doubleValue());
            }
            if (cls == Long.TYPE) {
                return v8Runtime.createV8ValueLong(((Long) obj).longValue());
            }
            if (cls == Short.TYPE) {
                return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
            }
            if (cls == Byte.TYPE) {
                return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
            }
            if (cls == Character.TYPE) {
                return v8Runtime.createV8ValueString(Character.toString(((Character) obj).charValue()));
            }
            return v8Runtime.createV8ValueUndefined();
        }
        if (obj instanceof V8Value) {
            return (T) obj;
        }
        if (obj instanceof IJavetNonProxy) {
            return (T) super.toV8Value(v8Runtime, obj, i2);
        }
        return (T) toProxiedV8Value(v8Runtime, obj);
    }
}

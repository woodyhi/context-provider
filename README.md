# context-provider

A simple lib for providing appContext in Application.


## Setting up the dependency in Gradle script

```groovy
dependencies {
    implementation 'com.github.woodyhi:context-provider:1.0.0'
}

```

## 1、get the application context
```
	Context c = ContextProvider.get();
```

## 2、get the Application instance

### case1

If an Application subclass implemented, and edit AndroidManifest.xml

```
	<application
		android:name=".MyApplication">
		...
	</application>
```

get MyApplication instance

```
	MyApplication a = ContextProvider.getApplication();

```


### case2

In the absence of a subclass, Android uses an instance of the base Application class.

get Application instance
```
	Application a = ContextProvider.getApplication();
```
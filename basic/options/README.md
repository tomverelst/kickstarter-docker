# Additional options

This tutorial will cover some additional options you can use when running contianers.

## Mounting

It is possible to mount volumes onto containers.
We can do this with the `-v` flag.
For example,
we can mount the `data` folder like this:

```
$ docker run -v data:/usr/src/data -it --rm alpine /bin/sh
/ #
```

The `-v data:/usr/src/data` option mounts the `data` directory onto the container as `/usr/src/data`.

The `-it` flag makes the container start in interactive mode,
and attaches the terminal to a pseudo terminal from the container.

The `--rm` flag tells the engine to remove the container after it has been stopped.

Since we started the container in interactive mode,
we can start executing commands.

```
$ ls /data
```

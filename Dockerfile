FROM ubuntu:latest
LABEL authors="aimrane"

ENTRYPOINT ["top", "-b"]
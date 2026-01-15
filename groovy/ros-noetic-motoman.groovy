node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'noetic-devel'
    registerROS('ros:noetic-ros-base', [
        'ros-noetic-control-msgs',
        'ros-noetic-industrial-robot-client',
        'ros-noetic-roslint'
    ], [])
}

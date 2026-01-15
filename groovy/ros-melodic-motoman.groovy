node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'noetic-devel'
    registerROS('ros:melodic-ros-base', [
        'ros-melodic-control-msgs',
        'ros-melodic-industrial-robot-client',
        'ros-melodic-roslint'
    ], [])
}

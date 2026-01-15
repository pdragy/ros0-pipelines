node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'kinetic-devel'
    registerROS('ros:kinetic-ros-base', [
        'ros-kinetic-control-msgs',
        'ros-kinetic-industrial-robot-client',
        'ros-kinetic-roslint'
    ], [])
}

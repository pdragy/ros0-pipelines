node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'indigo-devel'
    registerROS('ros:indigo-ros-base', [
        'ros-indigo-control-msgs',
        'ros-indigo-industrial-robot-client',
        'ros-indigo-roslint'
    ], [])
}

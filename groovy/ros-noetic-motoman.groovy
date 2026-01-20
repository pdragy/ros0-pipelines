node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'noetic-devel'
    registerROS('ros:noetic-desktop-full', [
        'ros-noetic-industrial-robot-client'
    ], [])
}
